# lembrando-coisas
Lembrando coisas


```mermaid
graph TD
    A[Inicio] --> B{Inicializar:};
    B --> C{Gerar estado inicial aleatorio (best) e calcular fitness (best_eval)};
    C --> D{current = best};
    D --> E{current_eval = best_eval};
    E --> F{n_moves_without_improvement = 0};
    F --> G{Loop por n_iterations (ate 5000 iteracoes)};
    G --> H{Calcular temperatura t = temperature / (i + 1)};
    H --> I{Gerar um vizinho (candidate) a partir de current};
    I --> J{Calcular fitness de candidate (candidate_eval)};
    J{candidate_eval == 0?} -->|Sim| K[Retornar candidate, candidate_eval, i+1];
    J -->|Nao| L{candidate_eval < current_eval?};
    L -->|Sim| M{current = candidate};
    M --> N{current_eval = candidate_eval};
    N --> O{n_moves_without_improvement = 0};
    O --> P{candidate_eval < best_eval?};
    P -->|Sim| Q{best = candidate};
    Q --> R{best_eval = candidate_eval};
    R --> G;
    P -->|Nao| G;
    L -->|Nao| S{random() < exp( (current_eval - candidate_eval) / t )?};
    S -->|Sim| T{current = candidate};
    T --> U{current_eval = candidate_eval};
    U --> V{n_moves_without_improvement = 0};
    V --> W{candidate_eval < best_eval?};
    W -->|Sim| Q;
    W -->|Nao| G;
    S -->|Nao| X{n_moves_without_improvement++};
    X --> Y{n_moves_without_improvement >= 500?};
    Y -->|Sim| Z[Retornar best, best_eval, i+1];
    Y -->|Nao| G;
    K --> End[Fim];
    Z --> End;
