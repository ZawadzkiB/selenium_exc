pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd shopizer_old && ./mvnw clean install'
            }
        }
        stage('E2E') {
            steps {
                sh 'BUILD_ID=dontKillMe' 
                sh 'if [ $(pidof apka) ]; then kill $(pidof apka); fi'
                sh 'cd shopizer_old && exec -a apka ./mvnw -f sm-shop/pom.xml clean spring-boot:run'
                
            }
        }
    }
}