# System Design Interview Prep

## The 45-Minute Interview Framework

* **0–5 Minutes (Requirements):** Split into functional features (limit to top 3) and non-functional requirements (read/write ratio, latency budgets, and consistency).
* **5–10 Minutes (Estimations):** Do quick back-of-the-envelope math for Daily Active Users (DAU), storage, bandwidth, and memory needs.
* **10–15 Minutes (High-Level Design):** Draw end-to-end data flows using basic clients, load balancers, application servers, and databases.
* **15–40 Minutes (Deep Dive):** Focus 80–90% of your score here by addressing bottlenecks, single points of failure, sharding, and caching trade-offs.
* **40–45 Minutes (Wrap-up):** Summarize trade-offs, mention what you would monitor, and discuss how to scale further under 10x load.

## Core Fundamentals to Study

* **Storage & Databases:** Relational vs. NoSQL, ACID vs. BASE, replication, and sharding strategies.
* **Scalability:** Horizontal vs. vertical scaling, consistent hashing, and load-balancing algorithms.
* **Performance & Caching:** Redis/Memcached patterns (write-through, cache-aside), CDNs, and latency numbers every engineer should know.
* **Asynchronous Processing:** Message queues (Kafka, RabbitMQ) to decouple heavy or spike-prone workflows.
* **Reliability:** CAP theorem, PACELC theorem, circuit breakers, and rate limiters.

## Top System Design FAQ Questions

* **Classic Scalability:** How would you design a URL shortener like TinyURL or a distributed cache?
* **High-Throughput Social/Feed:** How do you build a real-time newsfeed (Instagram/Twitter) or a chat app (WhatsApp)?
* **Large-Scale Media & Streaming:** How does Netflix, YouTube, or Spotify handle massive video and audio storage and CDN delivery?
* **Commerce & Location Services:** How do you build an Uber-like ride-matching system, a ticket booking engine (Ticketmaster), or a payment gateway?
* **AI & Modern Systems:** How do you design an LLM inference pipeline, vector search database, or semantic caching layer?