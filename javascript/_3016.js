function minPushesToType(word) {
  let freqMap = new Map();
  
  // Using greedy frequency-based allocation (this is basically gives pirority based on frequenecy of occurence.).
  // Count frequency of each letter.
  for (let char of word) {
      freqMap.set(char, (freqMap.get(char) || 0) + 1);
  }

  // Sort letters by frequency in descending order.
  let frequencies = Array.from(freqMap.values()).sort((a, b) => b - a);

  // Assign letters to keys 2-9.
  let keys = Array(8).fill(0); 
  let totalPushes = 0;

  for (let i = 0; i < frequencies.length; i++) {
      let keyIndex = i % 8;
      let presses = Math.floor(i / 8) + 1;
      totalPushes += frequencies[i] * presses;
  }

  return totalPushes;
}
