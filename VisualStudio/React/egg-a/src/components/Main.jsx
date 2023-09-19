import React from 'react';
import Hijo from './Hijo';


function Main(){
    const titulo = "Main";
    const texto = "El texto va en este lugar";
    
return (
    <div>
    <main className="Main">
        <br></br>
        <h5>{titulo}</h5>
        <h3>{texto}</h3>
        <br></br>
        <Hijo nombre="Chiquito" />
        <Hijo nombre="Filomena" />
        <br></br>
    </main>   
    </div>
);
}
export default Main;