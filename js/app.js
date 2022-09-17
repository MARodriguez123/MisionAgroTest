document.addEventListener('DOMContentLoaded', (event) => {
    
    const productosLacteos = document.querySelector('#productosLacteos');
    const shuffle = (array) => {
        array.sort(() => Math.random() - 0.5);
      }
    
    fetch('../public/data/lacteos.json')
    .then(response => response.json())
    .then(data =>{

        shuffle(data);
        data.forEach(lacteos => {
            productosLacteos.innerHTML += `
            <article class="col-3">
                <h2>${lacteos.productor}</h2>
                <img src="../img/lacteos/${lacteos.id}.jpg" alt="" width="200">
                <p><strong>Ubicacion: </strong>${lacteos.ubicacion}</p>
                <a class="btn btn-outline-primary w-75" href="./hero-detail.html?id=${lacteos.id}">Ver Detalles</a>
            </article>
            `
        })
        
        console.log(data);
    })
})