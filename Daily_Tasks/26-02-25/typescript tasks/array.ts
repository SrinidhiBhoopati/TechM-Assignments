
let fruits: string[] = ['Apple', 'Banana', 'Mango'];


fruits.push('Orange'); 
fruits.unshift('Strawberry'); 

console.log('After adding elements:', fruits);

fruits.pop(); 
fruits.shift(); 

console.log('After removing elements:', fruits);

console.log('Fruits in the array:');
fruits.forEach((fruit, index) => {
  console.log(`${index + 1}. ${fruit}`);
});

const indexOfBanana = fruits.indexOf('Banana');
if (indexOfBanana !== -1) {
  console.log('Found Banana at index:', indexOfBanana);
}

// Removing an element at a specific index (e.g., 'Banana')
fruits.splice(indexOfBanana, 1);

console.log('After removing Banana:', fruits);
