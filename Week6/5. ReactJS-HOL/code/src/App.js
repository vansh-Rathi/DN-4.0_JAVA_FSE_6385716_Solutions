import React from "react";
import CohortDetails from "./Components/CohortDetails";

function App() {
  return (
    <div>
      <CohortDetails name="React Bootcamp" startDate="2025-06-01" endDate="2025-07-31" status="Ongoing" />
      <CohortDetails name="Spring Boot Mastery" startDate="2025-04-01" endDate="2025-05-15" status="Completed" />
      <CohortDetails name="Design Patterns" startDate="2025-04-01" endDate="2025-05-15" status="Completed" />
      <CohortDetails name="Microservices" startDate="2025-04-01" endDate="2025-05-15" status="Ongoing" />
    </div>
  );
}

export default App;