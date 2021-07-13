<template>
  <table>
    <thead>
      <tr>
        <th></th>
        <th>Meter name</th>
        <th>Sku name</th>
        <th>Product name</th>
        <th>Retail price</th>
        <th>Unit price</th>
      </tr>
    </thead>
    <tbody>
      <tr
        v-for="(item, index) in items"
        v-bind:key="index"
      >
        <td>{{ index + 1 }}</td>
        <td>{{ item.meterName }}</td>
        <td>{{ item.skuName }}</td>
        <td>{{ item.productName }}</td>
        <td>{{ item.retailPrice }} {{ item.currencyCode }}</td>
        <td>{{ item.unitPrice }} {{ item.currencyCode }}</td>
      </tr>
    </tbody>
  </table>
</template>


<script>

const API = "http://localhost:9000/virtual/machine/";

export default {
  name: "App",
  data() {
    return {
      items: [],
      hasNext: true,
      loading: false
    };
  },
  mounted() {
    this.loading = true;
    this.$root.$emit("loader.show");
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
    fetch(API)
      .then((response) => response.json())
      .then((response) => {
        this.items = response.Items;
        this.hasNext = response.NextPageLink;
        this.scroll();
        this.$root.$emit("loader.hide");
        this.loading = false;
      });
  },
  methods: {
    scroll() {
      window.onscroll = () => {
        if (!this.loading && this.isBottomOfWindow()) {
          this.nbScroll++;
          this.askNext();
        }
      };
    },
    isBottomOfWindow() {
      return (
        Math.max(
          window.pageYOffset,
          document.documentElement.scrollTop,
          document.body.scrollTop
        ) +
          window.innerHeight >=
        document.documentElement.offsetHeight
      );
    },
    askNext() {
      if (this.hasNext) {
        this.loading = true;
        this.$root.$emit("loader.show");
        fetch(API + "?skip=" + this.items.length)
          .then((response) => response.json())
          .then((response) => {
            this.items = this.items.concat(response.Items);
            this.hasNext = response.NextPageLink;
            this.$root.$emit("loader.hide");
            this.loading = false;
          });
      }
    },
  },
};
</script>

<style scoped>

</style>
