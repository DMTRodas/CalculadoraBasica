import React, { useState } from 'react';

function Calculadora() {
    const [num1, setNum1] = useState('');
    const [operacion, setOperacion] = useState('');
    const [num2, setNum2] = useState('');
    const [message, setMessage] = useState('');

    const handlecheckNumber= async () => {
      const response = await fetch(`http://localhost:8080/api/calculator/check?number=${num1},${operacion},${num2}`); 
      const result = await response.text();
       
     setMessage(result);
    };

    return (
        <div className="calculadora-basica">
            <h2>Calculadora</h2>
            <h2>Ingrese valores</h2>
            <input
            type= "double"
            value= {num1}
            onChange={(e) => setNum1(e.target.value)} />
            <input
                type="char"
                value={operacion}
                onChange={(e) => setOperacion(e.target.value)}
                placeholder="Ingrese opcion"
            />
             <input
            type= "double"
            value= {num2}
            onChange={(e) => setNum2(e.target.value)} />
            <h3>Opciones para calcular: </h3>
            <h4>S=+, R=-, M=*, D=/</h4>
            <button onClick={handlecheckNumber}>Operar</button>
            <p>{message}</p>
        </div>
    );
}

export default Calculadora;