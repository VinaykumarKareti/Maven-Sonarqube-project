// pipeline {
//     agent any
//     tools {
//         jdk "jdk21"
//         maven "maven"
//     }

//     stages {
//         stage('git checkout') {
//             steps {
//                 git branch: 'main', changelog: false, poll: false, url: 'https://github.com/VinaykumarKareti/Maven-Sonarqube-project.git'
//             }
//         }
//         stage('build and sonar analysis') {
//             steps {
//                 dir('MyJavaApp') {
//                     script {
//                         bat "mvn clean package"
//                         bat '''mvn sonar:sonar ^
//                             -Dsonar.host.url=http://localhost:9000 ^
//                             -Dsonar.login=squ_71005741de717575dc717fc0ff274dfcda129cc1 ^
//                             -Dsonar.projectName=vinaysonarproject1 ^
//                             -Dsonar.java.binaries=target/classes ^
//                             -Dsonar.projectKey=vinaysonarproject1'''
//                     }
//                 }
//             }
//         }
//     }
// }

pipeline {
    agent any
    
    tools {
        jdk "jdk21"   // Adjust JDK version as per your Jenkins configuration
        maven "maven" // Adjust Maven version as per your Jenkins configuration
    }

    stages {
        stage('git checkout') {
            steps {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/VinaykumarKareti/Maven-Sonarqube-project.git'
            }
        }
        
        stage('build and test') {
            steps {
                dir('MyJavaApp') {
                    script {
                        // Clean and compile the Java application
                        bat "mvn clean compile"
                        
                        // Run tests and generate test reports
                        bat "mvn test"
                        
                        // Generate JaCoCo code coverage report
                        bat "mvn jacoco:report"
                    }
                }
            }
        }
        
        stage('sonar analysis') {
            steps {
                dir('MyJavaApp') {
                    script {
                        // Package the Java application
                        bat "mvn package"
                        
                        // Run SonarQube analysis
                        bat '''mvn sonar:sonar ^
                            -Dsonar.host.url=http://localhost:9000 ^
                            -Dsonar.login=squ_71005741de717575dc717fc0ff274dfcda129cc1 ^
                            -Dsonar.projectName=vinaysonarproject2 ^
                            -Dsonar.java.binaries=target/classes ^
                            -Dsonar.projectKey=vinaysonarproject2'''
                    }
                }
            }
        }
    }
}
