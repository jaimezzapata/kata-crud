import React, { useContext, useState, useRef } from 'react';
import consumer from "../tools/consumer";
import events from "../tools/events";
import Store from "../store";

export default () => {
    const { dispatch } = useContext(Store);
    const formRef = useRef(null);
    const [state, setState] = useState({ name: "" });

    const onCreate = (event) => {
        event.preventDefault();
        consumer.saveGroup({ name: state.name, id: null })
            .then((response) => {
                if (response.ok) {
                    response.json().then((newList) => {
                        dispatch(events.savedGroup(newList));
                        formRef.current.reset();
                        setState({ name: "" })
                    })
                }
            });

    };

    return <div id="nuevogroup">
        <form ref={formRef}>
            <center><b>Agregar elemento al CRUD</b></center>

            <input
                type="text"
                name="name"
                placeholder="Agregar grupo"
                onChange={(event) => {
                    setState({ name: event.target.value })
                }}  ></input>
            <br></br>
            <center>
                <button className="button button1" onClick={onCreate}>Nueva lista</button>
            </center>
        </form>
    </div>
};