let input = window.prompt("Enter Command: ");
let list = [];

while (
  input != null &&
  input.toLowerCase() !== "quiet" &&
  input.toLowerCase() !== "q"
) {
  if (input.toLowerCase() === "new") {
    let addToList = window.prompt("Add to List: ");
    list.push(addToList);
    console.log(addToList + " added to list");
  } else if (input.toLowerCase() === "list") {
    let count = 0;
    console.log("*************");
    for (let value of list) {
      console.log(count + ": " + value);
      count++;
    }
    console.log("*************");
  } else if (input.toLowerCase() === "delete") {
    let removeFromList = window.prompt("Index to delete: ");
    list.splice(removeFromList, 1);
  }

  input = window.prompt("Enter Command: ");
}
