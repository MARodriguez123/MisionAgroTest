function iniciar_sesion(){
    console.log('login está funcionando');

    let usuario = document.getElementById('correo').value;
    let password = document.getElementById('contraseña').value;
    let error = document.getElementById("error");


    console.log(usuario, password);
if(usuario == ""){

    error.innerText = "El Usuario es requerido";
    return ;

}

if (password == ""){
    error.innerText = "Es requerida la contraseña";
    return ;
}

postTologin ({
    "usuario" : usuario,
    "password  ": contraseña
});

};

let postTologin = async (bodyObject) =>{
    let url = "api/login";
    let response = await fetch(url, {
        method : "POST",
        body: bodyObject,
        headers:{
            "Content-Type": "application/json"
         }

    }) ;
};