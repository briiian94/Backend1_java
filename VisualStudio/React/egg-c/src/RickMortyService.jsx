const API_URL = 'https://rickandmortyapi.com/api/character';

async function fetchCharacters() {
    try {
      const response = await fetch(API_URL);
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      return data.results.slice(0, 20);
    } catch (error) {
      throw new Error(`Error fetching data: ${error.message}`);
    }
  }
  
  export { fetchCharacters };