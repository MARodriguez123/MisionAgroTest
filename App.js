document.addEventListener('DOMContentLoaded',() =>{
    console.log('Login Funcionando');
})

window.addEventListener('scroll', function(){
    let animacion = this.document.getElementById('animado');
    let posicionObjeto1 = animacion.getBoundingClientRect().top;
    console.log(posicionObjeto1);
    /*Para que me digan el tamaño al momento del dispositivo móvil*/
    let tamañodePantalla = window.innerHeight/4;
})