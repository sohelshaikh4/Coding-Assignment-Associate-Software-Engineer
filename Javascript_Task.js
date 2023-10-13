//Take a sentence as an input and reverse every word in that sentence.
//a. Example - This is a sunny day > shiT si a ynnus yad.

function reverseWordsInSentence(sentence) 
{
    const words = sentence.split(" ");
    const reverseWords = words.map((word) => word.split("").reverse().join(""));
    return reverseWords.join(" ");
  }  
  const sentence = "This is a sunny day";
  const reverseSentence = reverseWordsInSentence(sentence);
  
  console.log(reverseSentence);
  

  

//B. Perform sorting of an array in descending order.

const numbers = [10, 20, 40, 30, 50, 60];

numbers.sort(descendingOrderComparator);