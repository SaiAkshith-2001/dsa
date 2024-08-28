import React from "react";

export default function App() {
  const debounce = (fn, delay) => {
    let timer;
    return function (...args) {
      clearTimeout(timer);
      timer = setTimeout(() => {
        fn.apply(this, args);
      }, delay);
    };
  };
  const handleFetch = () => {
    console.log("fetching...");
  };
  const handleDebounce = React.useCallback(debounce(handleFetch, 300), []); //by using debounced function is created only once and memoized, so the same function is reused on every onKeyUp event.
  return (
    <div>
      <h1>Hello StackBlitz!</h1>
      <p>Start editing to see some magic happen :)</p>
      <input type="text" onKeyUp={handleDebounce} />
    </div>
  );
}
