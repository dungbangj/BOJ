const readline = require('readline');
const rl = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

rl.on('line', (input) => {
	const x = parseFloat(input);
	const result = 100 / (x * 1.609344 / 3.785411784);
	console.log(result.toFixed(6));
})