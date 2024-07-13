pipeline {
    agent any
    tools {
        jdk "jdk21"
        maven "maven"
    }

    stages {
        stage('git checkout') {
            steps {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/VinaykumarKareti/Maven-Sonarqube-project.git'
            }
        }
        stage('build and sonar analysis') {
            steps {
                dir('MyJavaApp') {
                    script {
                        bat "mvn clean package"
                        bat '''mvn sonar:sonar ^
                            -Dsonar.host.url=http://localhost:9000 ^
                            -Dsonar.login=squ_71005741de717575dc717fc0ff274dfcda129cc1 ^
                            -Dsonar.projectName=vinaysonarproject1 ^
                            -Dsonar.java.binaries=target/classes ^
                            -Dsonar.projectKey=vinaysonarproject1'''
                    }
                }
            }
        }
    }
}
