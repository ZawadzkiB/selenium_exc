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
                sh 'BUILD_ID=dontKillMe\n' +
                        '\n' + 
                        'if [ $(pidof apka) ]\n' +
                        'then\n' +
                        'kill $(pidof apka)\n' +
                        'fi\n' +
                        '\n' +
                        'bash -c "cd shopizer_old/sm-shop && exec -a apka ./mvnw clean spring-boot:run" &'
            }
        }
    }
}