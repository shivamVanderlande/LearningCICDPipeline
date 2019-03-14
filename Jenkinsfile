pipeline {
    agent any
  stages {
        stage('Run Tests') {
                stage('Test On Windows') {
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