pipeline {
    agent any
    tools{
        maven 'maven_3.8.6'
    }
    environment {
        DOCKER_PWD = credentials('dockerhubcridential')
    }
    stages {
        stage ('Build Maven'){
            steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/helsarayta/DevOps-Jenkins-Automation']]])
            bat 'mvn clean install'
            }
        }
        stage ('Build Docker Image'){
            steps {
                script {
                    bat 'docker build -t dockerimage/devops-jenkins-integration .'
                }

            }
        }
        stage ('Push Image to Hub'){
            steps {
                script {
                    bat 'docker login -u heydie -p %DOCKER_PWD%'
                    bat 'docker tag dockerimage/devops-jenkins-integration:latest heydie/devops-jenkins-integration:latest'
                    bat 'docker push heydie/devops-jenkins-integration:latest'
                }

                }

            }
        }
    }
