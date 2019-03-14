pipeline {
    agent any
  stages {
        stage('Run Tests') {
            parallel {
                stage('Test On Windows') {
                    agent {
                        label "windows"
                    }
                    steps {
                    	echo "Executing Windows BAt file"
                    }
                    post {
                        always {
                           echo "This test was for Windows"
                        }
                    }
                }
                stage('Test On Linux') {
                    agent {
                        label "linux"
                    }
                    steps {
                    	echo "Executing Windows Shell file"
                    }
                    post {
                        always {
                           echo "This test was for Linux"
                        }
                    }
                }
            }
        }
    }
}