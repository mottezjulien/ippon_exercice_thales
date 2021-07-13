<template>
  <div>
    <Loader />
    <List />
  </div>
</template>


<script>
import Loader from "./Loader.vue";
import List from "./List.vue";

export default {
  name: "App",
  components: { Loader, List },
};
</script>

<style scoped>
thead > td {
  color: blue;
}
</style>
