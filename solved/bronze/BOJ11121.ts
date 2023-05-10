import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8');
const lines: string[] = input.split("\n");

const T: number = parseInt(lines[0]);
let result : string = "";

for (let i = 1; i <= T; i++) {
    const twoWords : string[] = lines[i].split(" ");
    if (!twoWords[0].localeCompare(twoWords[1]))
        result += "OK\n";
    else
        result += "ERROR\n";
}
console.log(result);