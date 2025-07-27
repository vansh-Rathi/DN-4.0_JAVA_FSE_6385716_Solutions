import CalculateScore from './Components/CalculatorScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name="Vansh Rathi" 
        School="St. Thomas School" 
        total={489} 
        goal={500} 
      />
    </div>
  );
}

export default App;