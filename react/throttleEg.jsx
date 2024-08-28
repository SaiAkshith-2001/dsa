import React from "react";
//polyfill throttle
export default function App() {
  const throttle = (fn, limit) => {
    let flag = true;
    return function (...args) {
      if (flag) {
        fn.apply(this, args);
        flag = false;
      }
      setTimeout(() => {
        flag = true;
      }, limit);
    };
  };
  const handleSubmit = () => {
    console.log("submitting...");
  };
  const handleThrottle = throttle(handleSubmit, 2000);
  window.addEventListener("resize", handleThrottle);
  return (
    <div>
      <h1>Hello StackBlitz!</h1>
      <p>Start editing to see some magic happen :)</p>
    </div>
  );
}
//using lodash -throttle

// import React from 'react';
// import { throttle } from 'lodash';
// export default function App() {
//   const handleSubmit = () => {
//     console.log('submitting...');
//   };
//    const throttleLodash = React.useCallback(throttle(handleSubmit, 2000), []);
//   window.addEventListener('scroll', throttleLodash);
//   return (
//     <div>
//       <h1>Hello StackBlitz!</h1>
//       <p>Start editing to see some magic happen :)</p>
//     </div>
//   );
// }
