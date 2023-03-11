import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();
const inputs: string[] = input.split("\n");
const testCase: number = parseInt(input[0].trim());
let result: string = "";
for (let i = 1; i <= testCase; i++) {
    let lineNum: number[] = inputs[i].split(" ").map(one => parseInt(one));
    let col: number = lineNum[0];
    let row: number = lineNum[1];

    for (let j = 0; j < row; j++) {
        for (let k = 0; k < col; k++) {
            result += "X";
        }
        result += "\n";
    }
    if (i != testCase)
        result += "\n";
}

console.log(result);