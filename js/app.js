document.addEventListener('DOMContentLoaded',(event) =>{
    console.log('Páginas funcionando');

/**Para las frutas */
const frutasContainer = document.querySelector('#frutasContainer');
console.log(frutasContainer);
const shuffle=(array)=>{
    array.sort(() => Math.random()-0.5);
}

/**Vamos ahacer la petición de la ruta */

fetch('../public/data/frutas.json')
.then(response => response.json())
.then(data =>{

    shuffle(data);
    data.forEach(frutas => {
        frutasContainer.innerHTML +=` 
        <article class="col-3">
        <h2>${frutas.fruta}</h2>
        <img src="../img/frutas/${frutas.id}.jpg" alt="" width="200">
        <p><strong>clase:</strong>${frutas.clase}</p>

      </article>
      `
        
    });
    console.log(data);
})
/**Para las verduras */
const verdurasContainer = document.querySelector('#verdurasContainer');
console.log(verdurasContainer);
const shuffle1=(array)=>{
    array.sort(() => Math.random()-0.5);
}

/**Vamos ahacer la petición de la ruta */

fetch('../public/data/verduras.json')
.then(response => response.json())
.then(data =>{

    shuffle(data);
    data.forEach(verduras => {
        verdurasContainer.innerHTML +=` 
        <article class="col-3">
        <h2>${verduras.verdura}</h2>
        <img src="../img/verduras/${verduras.id}.jpg" alt="" width="200">
        <p><strong>clase:</strong>${verduras.clase}</p>

      </article>
      `
        
    });
    console.log(data);
})


/**Para los granos */
const granosContainer = document.querySelector('#granosContainer');
console.log(granosContainer);
const shuffle2=(array)=>{
    array.sort(() => Math.random()-0.5);
}

/**Vamos ahacer la petición de la ruta */

fetch('../public/data/granos.json')
.then(response => response.json())
.then(data =>{

    shuffle(data);
    data.forEach(granos => {
        granosContainer.innerHTML +=` 
        <article class="col-3">
        <h2>${granos.grano}</h2>
        <img src="../img/granos/${granos.id}.jpg" alt="" width="200">
        <p><strong>clase:</strong>${granos.clase}</p>

      </article>
      `
        
    });
    console.log(data);
})


})


/*Parte del scroll para el login*/
window.addEventListener('scroll', function(){
    let animacion = this.document.getElementById('animado');
    let posicionObjeto1 = animacion.getBoundingClientRect().top;
    console.log(posicionObjeto1);
    /*Para que me digan el tamaño al momento del dispositivo móvil*/
    let tamañodePantalla = window.innerHeight/4;
})