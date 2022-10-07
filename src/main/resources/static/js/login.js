let login =() =>{
  let email = document.getElementById("floatingInput").value;

  let password =document.getElementById("floatingPassword").value;

  if( email == ""){
   showError("El correo es requerido");
   return;


  };
if (password == ""){

    showError("La Contraseña es requerida");
    return;
};

postToLogin(body);


};

let postToLogin = async(bodyObject) =>{
    let url = "/api/login";
    let response = await fetch(url, {
        method :"POST",
        body:JSON.stringgify(bodyObject),
        headers:{

            "Content-Type":"application/json"

        }
    });

    if(response.ok){
        
    }
}

