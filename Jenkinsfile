pipeline {
    agent any
    stages {
        stage('BUild & Deploy') {
            steps {
                sh 'BUILD_ID=dontKillMe' 
                sh 'if [ $(pidof apka) ]; then kill $(pidof apka); fi'
                sh 'cd shopizer_old && ./mvnw clean install && exec -a apka ./mvnw -f sm-shop/pom.xml clean install spring-boot:run'
            }
        }
        stage('Test') {
            steps {
                sh 'curl -i -X GET "http://localhost:4160"'
            }
        }
    }
}