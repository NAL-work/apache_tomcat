pipeline {
    agent any

    stages {
//        stage('Setup') {
//            steps {
//                script {
//                    startZap(host: "127.0.0.1", port: 9091, timeout:500, zapHome: "/opt/zaproxy", sessionPath:"/somewhere/session.session", allowedHosts:['github.com'])
//                }
//            }
//        }
        stage('Build') {
            steps {
                echo 'Build stub'
                withAnt(installation: 'ant') {
                    sh "ant clean build-prepare compile-prepare compile"
                }
            }
        }
        stage ('SCA') {
            steps {
                dependencyCheck additionalArguments: ''' 
                    --out "./" 
                    --scan "./"
                    --format "ALL" 
                    --prettyPrint''', odcInstallation: 'OWASP-DC'
                dependencyCheckPublisher pattern: 'dependency-check-report.xml'
            }
        }
        stage('SAST') {
            environment {
                SCANNER_HOME = tool 'SonarQube'
                PROJECT_NAME = "${env.JOB_NAME}".replaceAll( ' ', '_' )
                
            }
            steps {
                echo "${PROJECT_NAME}"
                echo "${env.JOB_NAME}"
                withSonarQubeEnv('sonarqube') {
                    sh '''${SCANNER_HOME}/bin/sonar-scanner \
                        -X -e \
                        -Dsonar.projectKey=${PROJECT_NAME} \
                        -Dsonar.java.binaries=**/target/classes \
                        -Dsonar.exclusions=**/*.xml, **/*.class, **/test/*'''
                }
            }
        }
        stage('DAST') {
            steps {
                  echo 'DAST stub'
//                script {
//                    sh "mvn verify -Dhttp.proxyHost=127.0.0.1 -Dhttp.proxyPort=9091 -Dhttps.proxyHost=127.0.0.1 -Dhttps.proxyPort=9091" // Proxy tests through ZAP
//                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy stub'
            }
        }
    }
//    post {
//        always {
//            script {
//                archiveZap(failAllAlerts: 1, failHighAlerts: 0, failMediumAlerts: 0, failLowAlerts: 0, falsePositivesFilePath: "zapFalsePositives.json")
//            }
//        }
//    }
}
