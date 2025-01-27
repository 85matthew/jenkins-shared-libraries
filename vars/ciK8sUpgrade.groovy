def call(project, addr, namespace, tag) {
    sh """helm upgrade \
        ${project} \
        helm/${project} -i \
        --namespace ${namespace} \
        --set image.tag=${tag} \
        --set ingress.host=${addr} \
        --reuse-values"""
}
