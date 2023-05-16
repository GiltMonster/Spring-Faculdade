export default function Pesquisar() {
    return(
        <>
        <form>
            <div className="mb-3">
                <h1>Pesquisar:</h1>
                <input type="text" className="form-control my-2" placeholder="Nome:" />
            </div>

            <input type="submit" className="btn btn-primary mx-1" value={"Pesquisar"} />
        </form>
    </>
    );
}