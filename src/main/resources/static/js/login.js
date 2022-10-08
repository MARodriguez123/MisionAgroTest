let login =() =>{
  let email = document.getElementById("floatingInput").value;

  let password =document.getElementById("floatingPassword").value;

  if( email == ""){
   showError("El correo es requerido");
   return;


  }
if (password == ""){

    showError("La Contraseña es requerida");
    return;
}

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
        let  user = await response.json();
        localStorage.setItem("loggedEmail", JSON.stringify(email) );
        alert("Te damos la Bienvenida" + user.email+ "!", "success");

        await new Promise(r=>setTimeout(r,2000));
        window.location.href="/publicaciones"

        }else{
            let message = await response.text();
            showError(message);
        }
};

let showError = (message)=>{
    alert(message,"danger");

}

let alert =(message,type)=>{
   document.getElementById("errorBox").innerHTML=[
    `<div class="alert alert-${type} alert-dismissible" role="alert">`,
    `   <div>${message}</div>`,
    '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
    '</div>'
   ].join('')
}

