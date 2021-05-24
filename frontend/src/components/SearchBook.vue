<template>

<v-data-table
    :headers="headers"
    :items="searchBook"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'SearchBook',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "bookId", value: "bookId" },
            { text: "bookStatus", value: "bookStatus" },
        ],
        searchBook : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/searchbooks')

      this.searchBook = temp.data._embedded.searchbooks;

    },
    methods: {
    }
  }
</script>

