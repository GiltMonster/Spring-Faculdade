import axios from "axios";
import { useRef } from "react";

export default function Excluir() {


    const raRef = useRef(null);

    function deletar() {
       
        axios.delete(`http://localhost:8080/faculdade/${raRef.current.value}`,[])
        .then(function (response) {
            console.log(response);

        }).catch(function (error) {
            console.error(error);
          });

    }

    return(
        <>
            <form method="">
                <div className="mb-3">
                    <h1>Excluir:</h1>
                    <input type="text" className="form-control my-2" placeholder="RA:" ref={raRef}/>
                </div>

            </form>
                <input type="submit" className="btn btn-danger mx-1" value={"Deletar"} onClick={deletar}/>
        </>
    );
}