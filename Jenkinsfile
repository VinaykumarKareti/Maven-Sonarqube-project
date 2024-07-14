
// pipeline {
//     agent any
    
//     tools {
//         jdk "jdk21"   // Adjust JDK version as per your Jenkins configuration
//         maven "maven" // Adjust Maven version as per your Jenkins configuration (version: 3.9.8)
//     }

//     stages {
//         stage('git checkout') {
//             steps {
//                 git branch: 'main', changelog: false, poll: false, url: 'https://github.com/VinaykumarKareti/Maven-Sonarqube-project.git'
//             }
//         }
        
//         stage('build and test') {
//             steps {
//                 dir('MyJavaApp') {
//                     script {
//                         // Clean and compile the Java application
//                         bat "mvn clean compile"
                        
//                         // Run tests and generate test reports
//                         bat "mvn test"
                        
//                         // Generate JaCoCo code coverage report
//                         bat "mvn jacoco:report"
//                     }
//                 }
//             }
//         }
        
//         stage('sonar analysis') {
//             steps {
//                 dir('MyJavaApp') {
//                     script {
//                         // Package the Java application
//                         bat "mvn package"
                        
//                         // Run SonarQube analysis
//                         bat '''mvn sonar:sonar ^
//                             -Dsonar.host.url=http://localhost:9000 ^
//                             -Dsonar.login=squ_08bc39a7733151c0e91892d78e06428c2211a197 ^
//                             -Dsonar.projectName=vinaysonarproject3 ^
//                             -Dsonar.java.binaries=target/classes ^
//                             -Dsonar.projectKey=vinaysonarproject3'''
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
        maven "maven" // Adjust Maven version as per your Jenkins configuration (version: 3.9.8)
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
                            -Dsonar.login=squ_08bc39a7733151c0e91892d78e06428c2211a197 ^
                            -Dsonar.projectName=vinaysonarproject4 ^
                            -Dsonar.java.binaries=target/classes ^
                            -Dsonar.projectKey=vinaysonarproject4'''
                    }
                }
            }
        }
    }
}
