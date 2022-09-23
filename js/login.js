function iniciar_sesion(){
    console.log('login está funcionando');

    let usuario = document.getElementById('correo').value;
    let password = document.getElementById('contraseña').value;

    console.log(usuario, password);

    if(usuario == 'usuario@email.com'  && password == '123' ){

        window.location.href = '../templates/publicaciones.html';
        localStorage.usuario= 'usuario';
    }else{
        alert('Este Usuario no se encuentra registrado, por favor verifique la informacón');
    }

}