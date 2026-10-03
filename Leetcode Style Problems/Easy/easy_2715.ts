type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Fn = (...args: JSONValue[]) => void

const cancellable = (fn: Function, args: any[], t: number): Function => {
    let willFnCall = true;
    setTimeout(() => willFnCall && fn(...args), t);
    return () => willFnCall = false;
};

const result = [];
const fn = (x) => x * 5;
const args = [2], t = 20, cancelTimeMs = 50;
const start = performance.now();

const log = (...argsArr) => {
    const diff = Math.floor(performance.now() - start);
    result.push({"time": diff, "returned": fn(...argsArr)});
}

const cancel = cancellable(log, args, t);
const maxT = Math.max(t, cancelTimeMs);

setTimeout(cancel, cancelTimeMs);
setTimeout(() => {
    console.log(result); // [{"time":20,"returned":10}]
}, maxT + 15);
