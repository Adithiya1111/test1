const myBadlyFormattedObject = {
  name: "John Doe",
  age: 30,
  city: "New York",
  hobbies: ["reading", "coding", "gaming"],
};

function sampleFunction(a, b) {
  if (a > b) {
    console.log("a is greater");
  } else {
    return a + b;
  }
}

const longString =
  "This is a very long string that should ideally exceed the standard print width rules if you have them configured a certain way in your editor configuration file";

console.log(myBadlyFormattedObject);
sampleFunction(5, 10);
