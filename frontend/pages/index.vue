<template>
  <div class="container">
    <div>
      <Logo />
      <h1 class="title">frontend</h1>
      <div class="links">
        <a
          href="https://nuxtjs.org/"
          target="_blank"
          rel="noopener noreferrer"
          class="button--green"
        >
          Documentation
        </a>
        <a
          href="https://github.com/nuxt/nuxt.js"
          target="_blank"
          rel="noopener noreferrer"
          class="button--grey"
        >
          GitHub
        </a>
      </div>
    </div>
    <button @click="testPost">testPost1</button>
    <button @click="testPost2">testPost2</button>
  </div>
</template>

<script>
import testApi from '~/api/test'

export default {
  methods: {
    testPost() {
      const request = {
        id: 'testId',
        password: 'testPW',
      }

      testApi
        .testPost(request)
        .then((value) => {
          console.log(value)
          alert(value)
        })
        .catch((reason) => alert(reason))
    },
    testPost2() {
      const request = {
        id: 'testId2',
        password: 'testPW2',
      }

      testApi
        .testPost2(request)
        .then((value) => {
          console.log(value)
          alert(value)
        })
        .catch((reason) => alert(reason))
    },
  },
}
</script>

<style>
.container {
  margin: 0 auto;
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}

.title {
  font-family: 'Quicksand', 'Source Sans Pro', -apple-system, BlinkMacSystemFont,
    'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif;
  display: block;
  font-weight: 300;
  font-size: 100px;
  color: #35495e;
  letter-spacing: 1px;
}

.subtitle {
  font-weight: 300;
  font-size: 42px;
  color: #526488;
  word-spacing: 5px;
  padding-bottom: 15px;
}

.links {
  padding-top: 15px;
}
</style>
