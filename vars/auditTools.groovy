def call() {
    node {
      sh '''
        git version
        docker version
        docker-compose --version
        df -h
      '''
    }
}
