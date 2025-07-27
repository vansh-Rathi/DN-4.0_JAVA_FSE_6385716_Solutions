import styles from "./CohortDetails.module.css";

function CohortDetails({ name, startDate, endDate, status }) {
  const headingStyle = {
    color: status.toLowerCase() === "ongoing" ? "green" : "blue"
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>{name}</h3>
      <dl>
        <dt>Start Date:</dt>
        <dd>{startDate}</dd>
        <dt>End Date:</dt>
        <dd>{endDate}</dd>
        <dt>Status:</dt>
        <dd>{status}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;