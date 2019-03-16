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
                sh 'if [ $(pidof apka) ]
                    then
                    kill $(pidof apka)
                    fi'
                sh 'bash -c "cd shopizer_old/sm-shop && exec -a apka ./mvnw clean spring-boot:run" &'
            }
        }
    }
}