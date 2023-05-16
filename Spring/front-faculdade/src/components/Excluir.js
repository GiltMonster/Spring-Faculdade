export default function Excluir() {
    return(
        <>
            <form>
                <div className="mb-3">
                    <h1>Excluir:</h1>
                    <input type="text" className="form-control my-2" placeholder="RA:" />
                </div>

                <input type="submit" className="btn btn-danger mx-1" value={"Deletar"} />
            </form>
        </>
    );
}