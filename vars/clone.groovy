def call(String url, String branch){
  echo "cloaning started"
  git url: "${url}", branch: "${branch}"
  echo "cloaning stopped"
}
