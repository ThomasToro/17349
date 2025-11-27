<script>
    //code js
    export let texto= 'Botón';
    export let color= 'yellow';
</script>


<button style="--btn-color:{color}">
    {texto}
</button>



<style>
    /*css*/

    button{
        color:black;
        background-color:var(--btn-color);
    }
</style>