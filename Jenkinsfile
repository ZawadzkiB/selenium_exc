pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd shopizer_old && ./mvnw clean install'
            }
        }
        stage('Deploy') {
            steps {
                sh 'BUILD_ID=dontKillMe' 
                sh 'if [ $(pidof apka) ]; then kill $(pidof apka); fi'
                sh 'cd shopizer_old && exec -a apka ./mvnw -f sm-shop/pom.xml clean spring-boot:run &'
            }
        }
        stage('Test') {
            steps {
                sh 'curl -i -X GET "http://localhost:4160"'
            }
        }
    }
}