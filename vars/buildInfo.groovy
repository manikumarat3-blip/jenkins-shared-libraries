def call() {
    echo "=============================="
    echo " Jenkins Build Information"
    echo "=============================="
    echo "Job Name: ${env.JOB_NAME}"
    echo "Build Number: ${env.BUILD_NUMBER}"
    echo "Workspace: ${env.WORKSPACE}"
    echo "Build URL: ${env.BUILD_URL}"
    echo "=============================="
}
