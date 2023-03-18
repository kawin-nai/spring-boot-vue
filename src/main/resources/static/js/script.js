const vm = new Vue({
    el: "#app",
    data: {
        rows: [],
        editForm: {
            id: undefined,
            name: undefined,
            year: undefined,
            rank: undefined,
        },
        API_URL: "http://localhost/api/movies"
    },
    methods: {
        getMovies() {
            fetch(this.API_URL)
                .then((response) => {
                    if (response.ok) {
                        console.log(response);
                        return response.json();
                    }
                })
                .then(json => this.rows = json)
        },
        saveMovie() {
            console.log(this.editForm)
            fetch(this.API_URL + `/${this.editForm.id}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.editForm)
            }).then(() => this.editForm.id = undefined)
                .then(() => this.getMovies());
        },
        editMovie(row) {
            this.editForm.id = row.id;
            this.editForm.name = row.name;
            this.editForm.year = row.year;
            this.editForm.rank = row.rank;
        },
        deleteMovie(row) {
            fetch(this.API_URL + `/${row.id}`, {
                method: 'DELETE'
            }).then(() => this.getMovies())
        }
    },
    mounted() {
        this.getMovies();
    }
});
