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
                sh 'cd shopizer_old && bash -c "exec -a apka ./mvnw -f sm-shop/pom.xml clean spring-boot:run" &'
            }
        }
        stage('Test') {
            steps {
                sh 'echo test'
                sh 'curl --connect-timeout 5 --max-time 10 --retry 5 --retry-delay 0 --retry-max-time 20 -i "http://localhost:4160"'
            }
        }
    }
}