
let Controlador = {
    visitantes: function(){
        const contenidoVisitantes = document.querySelector("#contenidoVisitantes");
        const contenidoMensajes = document.querySelector("#contenidoMensajes");
        console.log("Javascript activo y funcionando!!")

        fetch('http://localhost:8080/apirest/visitantes')
        .then(response =>{
            return response.json()
        })
        .then(response =>{
            contenidoVisitantes.innerHTML ="";
            console.log(response)
            for(let dato of response){
                contenidoVisitantes.innerHTML +=`
                <tr>
              <th>${dato.fecha}</th>
              <td>${dato.comentario}</td>
            </tr>
            `
           }
        }).catch(error=>console.error(`Ha ocurrido un error: ${error}`));

    },
    mensajes: function(){
        console.log("Mensajes desde MongoDB");
        fetch('http://localhost:8080/apirest/mensajes')
        .then(response =>{
            return response.json()
        })
        .then(response =>{
            contenidoMensajes.innerHTML ="";
            console.log(response)
            for(let dato of response){
                contenidoMensajes.innerHTML +=`
                <tr>
              <td>${dato.idioma}</td>
              <td>${dato.mensaje}</td>
            </tr>
            `
           }
        }).catch(error=>console.error(`Ha ocurrido un error: ${error}`));

    }
};
window.addEventListener("load", Controlador.visitantes);
window.addEventListener("load", Controlador.mensajes);
